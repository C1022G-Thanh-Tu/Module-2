package case_study.furama_resort.utils;

public class RegexCode {
    public static final String ROOM_CODE_REGEX = "^SVRO-\\d{4}$";
    public static final String VILLA_CODE_REGEX = "^SVVL-\\d{4}$";
    public static final String SERVICE_NAME_REGEX = "^[A-Z][a-z]*+(\\s[a-z]+)*$";
    public static final String USABLE_AREA_REGEX = "^0*([1-9]\\d{2,}|[3-9]\\d|[1-9]\\d{2,}[.]\\d+|[3-9]\\d[.]\\d+)$";
    public static final String POOL_AREA_REGEX = "^0*([1-9]\\d{2,}|[3-9]\\d|[1-9]\\d{2,}[.]\\d+|[3-9]\\d[.]\\d+)$";
    public static final String RENTAL_COSTS_REGEX = "^0*\\d+.*\\d+$";
    public static final String MAXIMUM_NUMBER_OF_PEOPLE = "^0*([1-9]|1[0-9])$";
    public static final String FLOOR_NUMBER_REGEX = "^0*[1-9]\\d*$";
    public static final String RENTAL_TYPE_REGEX = "^[A-Z][a-z]*+(\\s[a-z]+)*$";
    public static final String ROOM_STANDARD_REGEX = "^[A-Z][a-z]*+(\\s[a-z]+)*$";
}
