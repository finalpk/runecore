package com.gecko.model.world.def;


/**
 * WorldLocation.java
 * RuneCore 525 www.runecore.org
 * @author Canownueasy, Sinisoul + Harry Andreas
 * 4 Jun 2011
 */
public enum WorldLocation {
	
	COUNTRY_AFGHANISTAN(5),
	COUNTRY_ALBANIA(8),
	COUNTRY_ALGERIA(61),
	COUNTRY_AMERICAN_SAMOA(14),
	COUNTRY_ANDORRA(3),
	COUNTRY_ANGOLA(11),
	COUNTRY_ANGUILLA(7),
	COUNTRY_ANTARCTICA(12),
	COUNTRY_ANTIGUA_AND_BARBUDA(6),
	COUNTRY_ARGENTINA(13),
	COUNTRY_ARMENIA(9),
	COUNTRY_ARUBA(17),
	COUNTRY_AUSTRALIA(16),
	COUNTRY_AUSTRIA(15),
	COUNTRY_AZERBAIJAN(18),
	COUNTRY_BAHAMAS(32),
	COUNTRY_BAHRAIN(25),
	COUNTRY_BANGLADESH(21),
	COUNTRY_BARBADOS(20),
	COUNTRY_BELARUS(36),
	COUNTRY_BELGIUM(22),
	COUNTRY_BELIZE(37),
	COUNTRY_BENIN(27),
	COUNTRY_BERMUDA(28),
	COUNTRY_BHUTAN(33),
	COUNTRY_BOLIVIA(30),
	COUNTRY_BOSNIA_AND_HERZEGOVINA(19),
	COUNTRY_BOTSWANA(35),
	COUNTRY_BOUVET_ISLAND(34),
	COUNTRY_BRAZIL(31),
	COUNTRY_BRITISH_INDIAN_OCEAN_TERRITORY(104),
	COUNTRY_BRUNEI_DARUSSALAM(29),
	COUNTRY_BULGARIA(24),
	COUNTRY_BURKINA_FASO(23),
	COUNTRY_BURUNDI(26),
	COUNTRY_CAMBODIA(114),
	COUNTRY_CAMEROON(47),
	COUNTRY_CANADA(38),
	COUNTRY_CAPE_VERDE(52),
	COUNTRY_CAYMAN_ISLANDS(121),
	COUNTRY_CENTRAL_AFRICAN_REPUBLIC(41),
	COUNTRY_CHAD(207),
	COUNTRY_CHILE(46),
	COUNTRY_CHINA(48),
	COUNTRY_CHRISTMAS_ISLAND(53),
	COUNTRY_COCOS_KEELING_ISLANDS(39),
	COUNTRY_COLOMBIA(49),
	COUNTRY_COMOROS(116),
	COUNTRY_CONGO(42),
	COUNTRY_CONGO_THE_DEMOCRATIC_REPUBLIC_OF_THE(40),
	COUNTRY_COOK_ISLANDS(45),
	COUNTRY_COSTA_RICA(50),
	COUNTRY_COTE_DIVOIRE(44),
	COUNTRY_CROATIA(97),
	COUNTRY_CUBA(51),
	COUNTRY_CYPRUS(54),
	COUNTRY_CZECH_REPUBLIC(55),
	COUNTRY_DENMARK(58),
	COUNTRY_DJIBOUTI(57),
	COUNTRY_DOMINICA(59),
	COUNTRY_DOMINICAN_REPUBLIC(60),
	COUNTRY_EAST_TIMOR(216),
	COUNTRY_ECUADOR(62),
	COUNTRY_EGYPT(64),
	COUNTRY_EL_SALVADOR(203),
	COUNTRY_EQUATORIAL_GUINEA(87),
	COUNTRY_ERITREA(66),
	COUNTRY_ESTONIA(63),
	COUNTRY_ETHIOPIA(68),
	COUNTRY_FALKLAND_ISLANDS_MALVINAS(71),
	COUNTRY_FAROE_ISLANDS(73),
	COUNTRY_FIJI(70),
	COUNTRY_FINLAND(69),
	COUNTRY_FRANCE(74),
	COUNTRY_FRANCE_METROPOLITAN(75),
	COUNTRY_FRENCH_GUIANA(80),
	COUNTRY_FRENCH_POLYNESIA(170),
	COUNTRY_FRENCH_SOUTHERN_TERRITORIES(208),
	COUNTRY_GABON(76),
	COUNTRY_GAMBIA(84),
	COUNTRY_GEORGIA(79),
	COUNTRY_GERMANY(56),
	COUNTRY_GHANA(81),
	COUNTRY_GIBRALTAR(82),
	COUNTRY_GREECE(88),
	COUNTRY_GREENLAND(83),
	COUNTRY_GRENADA(78),
	COUNTRY_GUADELOUPE(86),
	COUNTRY_GUAM(91),
	COUNTRY_GUATEMALA(90),
	COUNTRY_GUINEA(85),
	COUNTRY_GUINEA_BISSAU(92),
	COUNTRY_GUYANA(93),
	COUNTRY_HAITI(98),
	COUNTRY_HEARD_ISLAND_AND_MCDONALD_ISLANDS(95),
	COUNTRY_HOLY_SEE_VATICAN_CITY_STATE(228),
	COUNTRY_HONDURAS(96),
	COUNTRY_HONG_KONG(94),
	COUNTRY_HUNGARY(99),
	COUNTRY_ICELAND(107),
	COUNTRY_INDIA(103),
	COUNTRY_INDONESIA(100),
	COUNTRY_IRAN_ISLAMIC_REPUBLIC_OF(106),
	COUNTRY_IRAQ(105),
	COUNTRY_IRELAND(101),
	COUNTRY_ISRAEL(102),
	COUNTRY_ITALY(108),
	COUNTRY_JAMAICA(109),
	COUNTRY_JAPAN(111),
	COUNTRY_JORDAN(110),
	COUNTRY_KAZAKSTAN(122),
	COUNTRY_KENYA(112),
	COUNTRY_KIRIBATI(115),
	COUNTRY_KOREA_DEMOCRATIC_PEOPLES_REPUBLIC_OF(118),
	COUNTRY_KOREA_REPUBLIC_OF(119),
	COUNTRY_KUWAIT(120),
	COUNTRY_KYRGYZSTAN(113),
	COUNTRY_LAO_PEOPLES_DEMOCRATIC_REPUBLIC(123),
	COUNTRY_LATVIA(132),
	COUNTRY_LEBANON(124),
	COUNTRY_LESOTHO(129),
	COUNTRY_LIBERIA(128),
	COUNTRY_LIBYAN_ARAB_JAMAHIRIYA(133),
	COUNTRY_LIECHTENSTEIN(126);
	
	public int opcode;
	public String name;
	
	
	WorldLocation(int opcode) {
		this.opcode = opcode;
		name = this.name().replaceAll("COUNTRY_", "");
	}
	
}