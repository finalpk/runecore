package com.gecko;

public final class Constants {
	
	/**
	 * Keys for updating.
	 */
	public static final short[] UPDATE_KEYS = { 
		0xff, 0x00, 0xff, 0x00, 0x00,
		0x00, 0x00, 0x80, 0x13, 0x8c,
		0xcd, 0xa9, 0x00, 0x00, 0x00,
		0x00, 0x32, 0x82, 0x9c, 0xb6,
		0x00, 0x00, 0x00, 0x00, 0xa0,
		0xa0, 0xc6, 0xfe, 0x00, 0x00,
		0x00, 0x00, 0x42, 0x21, 0x15,
		0xd9, 0x00, 0x00, 0x00, 0x00,
		0x60, 0xef, 0x0c, 0xa6, 0x00,
		0x00, 0x00, 0x00, 0xf2, 0x38,
		0xda, 0x1f, 0x00, 0x00, 0x00,
		0x00, 0x0b, 0xc6, 0x96, 0x3d,
		0x00, 0x00, 0x00, 0x00, 0x7e,
		0xdf, 0x4d, 0x19, 0x00, 0x00,
		0x00, 0x00, 0xc9, 0xb2, 0x51,
		0xa8, 0x00, 0x00, 0x00, 0x00,
		0x18, 0x2e, 0xdd, 0x7c, 0x00,
		0x00, 0x00, 0x00, 0x2e, 0xcb,
		0xa4, 0xad, 0x00, 0x00, 0x00,
		0x00, 0x7c, 0x2c, 0xf0, 0xa7,
		0x00, 0x00, 0x00, 0x00, 0xb8,
		0x1a, 0x3f, 0x7f, 0x00, 0x00,
		0x00, 0x00, 0x24, 0xbd, 0x8b,
		0xb0, 0x00, 0x00, 0x00, 0x00,
		0x4a, 0x97, 0x17, 0x1d, 0x00,
		0x00, 0x00, 0x00, 0xb8, 0xf2,
		0x4d, 0x21, 0x00, 0x00, 0x00,
		0x00
	};
	
	/**
	 * An array of valid characters in a long username.
	 */
	public static final char VALID_CHARS[] = { '_', 'a', 'b', 'c', 'd',
		'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
		'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3',
		'4', '5', '6', '7', '8', '9', '!', '@', '#', '$', '%', '^', '&',
		'*', '(', ')', '-', '+', '=', ':', ';', '.', '>', '<', ',', '"',
		'[', ']', '|', '?', '/', '`' };
	
	/**
	 * Packed text translate table.
	 */
	public static final char XLATE_TABLE[] = { ' ', 'e', 't', 'a', 'o', 'i', 'h', 'n',
		's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b',
		'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6',
		'7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-',
		'&', '*', '\\', '\'', '@', '#', '+', '=', '\243', '$', '%', '"',
		'[', ']' };
	
	/**
	 * Incoming packet sizes array.
	 */
	public static final int[] PACKET_LENGTHS = new int[] {
	  //0---1---2---3---4---5---6---7---8---9
		0, -3, -3, -3, 2, -3, -3, 02, -3, -3, // 0
		-3, 8, -3, -3, -3, -3, -3, -3, -3, -3, // 1
		-3, 8, 06, 16, 2, -1, -3, -3, -3, -3, // 2
		10, 00, -3, -3, -3, 04, -1, -3, -3, 8, // 3
		-3, -3, -3, -3, -3, 14, -3, -3, 14, -3, // 4
		-3, -3, -3, 06, -3, 9, 8, -3, 06, -1, // 5
		-3, -3, -3, 0, 06, -3, -3, -1, 00, -3, // 6
		-3, -3, -3, -3, -3, -3, -3, -3, -3, -3, // 7
		8, 2, -3, -3, -3, -3, -3, 04, -3, -3, // 8
		-3, 8, -3, 8, -3, -3,  8, 0, -3, -3, // 9
		-3, 01, -3, -3, -3, 06, -3, 06, -3, -3, // 10
		-3, -3, -3, -3, 2, -3, -1, -3, 8, 2, // 11
		3, -3, -3, -3, -3, -3, -3, 04, -3, -3, // 12
		-3, -3, -3, -3, -3, 12, 2, -3, 2, 10, // 13
		-3, 00, 00, -3, -3, -3, -3, -3, -3, 9, // 14
		-3, -3, 01, 8, -3, -3, -3, -3, -3, -3, // 15
		-3, -3, 04, -3, -3, -3, -3, -3, 13, -3, // 16
		8, -3, -3, 2, -3, -3, -3, 6, -3, -3, // 17
		-3, -3, 12, 00, -3, -3, -1, -3, 14, 2, // 18
		-3, -1, -3, -3, -3, -3, -3, -3, -3, 8, // 19
		-3, -3, -3, -1, -3, -3, -3, -3, -3, -3, // 20
		-3, -3, 8, -3, -3, -3, 8, -3, 8, -3, // 21
		-3, 00, -3, -3, -3, 6, -3, -3, -3, -3, // 22
		-3, -3, -3, -3, -3, -3, -3, 8, 06, -3, // 23
		-3, 2, -3, 8, -3, -3, -3, -3, -3, -3, // 24
		-3, -3, -3, -3, -3, // 25
	};

}