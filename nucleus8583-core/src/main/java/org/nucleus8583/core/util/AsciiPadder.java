package org.nucleus8583.core.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

import org.nucleus8583.core.xml.FieldAlignments;

public class AsciiPadder {

	private char padWith;

	private FieldAlignments align;

	private int length;

	private char[] padder;

	private char[] emptyValue;

	public void setPadWith(char padWith) {
		this.padWith = padWith;
	}

	public void setAlign(FieldAlignments align) {
		this.align = align;
	}

	public FieldAlignments getAlign() {
		return align;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setEmptyValue(char[] emptyValue) {
		this.emptyValue = emptyValue;
	}

	public void initialize() {
		padder = new char[length];
		Arrays.fill(padder, padWith);
	}

	public void pad(OutputStream out, String value, int valueLength)
			throws IOException {
		if (valueLength == 0) {
			write(out, padder, 0, length);
		} else if (valueLength == length) {
			write(out, value, 0, valueLength);
		} else {
			switch (align) {
			case TRIMMED_LEFT:
            case UNTRIMMED_LEFT:
				write(out, value, 0, valueLength);
				write(out, padder, 0, length - valueLength);

				break;
            case TRIMMED_RIGHT:
            case UNTRIMMED_RIGHT:
				write(out, padder, 0, length - valueLength);
				write(out, value, 0, valueLength);

				break;
			default: // NONE
				write(out, value, 0, valueLength);
				write(out, padder, 0, length - valueLength);

				break;
			}
		}
	}

	public char[] unpad(InputStream in, int bytesLength) throws IOException {
		char[] value = new char[bytesLength];
		read(in, value, 0, bytesLength);

		char[] result;
		int resultLength;

		switch (align) {
		case TRIMMED_LEFT:
			resultLength = 0;

			for (int i = bytesLength - 1; i >= 0; --i) {
				if (value[i] != padWith) {
					resultLength = i + 1;
					break;
				}
			}

			if (resultLength == 0) {
				result = emptyValue;
			} else if (resultLength == bytesLength) {
				result = value;
			} else {
				result = new char[resultLength];
				System.arraycopy(value, 0, result, 0, resultLength);
			}

			break;
		case TRIMMED_RIGHT:
			int padLength = bytesLength;

			for (int i = 0; i < bytesLength; ++i) {
				if (value[i] != padWith) {
					padLength = i;
					break;
				}
			}

			if (padLength == 0) {
				result = value;
			} else if (padLength == bytesLength) {
				result = emptyValue;
			} else {
				resultLength = bytesLength - padLength;

				result = new char[resultLength];
				System.arraycopy(value, padLength, result, 0, resultLength);
			}

			break;
		default: // NONE, UNTRIMMED_LEFT, UNTRIMMED_RIGHT
			result = value;
			break;
		}

		return result;
	}

	public void read(InputStream in, char[] cbuf, int off, int len)
			throws IOException {
		byte[] bbuf = new byte[len];
		IOUtils.readFully(in, bbuf, len);

		for (int i = 0, j = off; i < len; ++i, ++j) {
			cbuf[j] = (char) (bbuf[i] & 0x7F);
		}
	}

	public void write(OutputStream out, char[] cbuf, int off, int len)
			throws IOException {
		if (off == 0) {
			for (int i = 0; i < len; ++i) {
				out.write(cbuf[i] & 0x7F);
			}
		} else {
			for (int i = 0, j = off; i < len; ++i, ++j) {
				out.write(cbuf[j] & 0x7F);
			}
		}
	}

	public void write(OutputStream out, String str, int off, int len)
			throws IOException {
		if (off == 0) {
			for (int i = 0; i < len; ++i) {
				out.write(str.charAt(i) & 0x7F);
			}
		} else {
			for (int i = 0, j = off; i < len; ++i) {
				out.write(str.charAt(j++) & 0x7F);
			}
		}
	}
}