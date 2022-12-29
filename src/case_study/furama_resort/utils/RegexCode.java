package case_study.furama_resort.utils;

public class RegexCode {
    private final String ROOM_CODE_REGEX = "^SVRO-\\d{4}$";
    private final String VILLA_CODE_REGEX = "^SVVL-\\d{4}$";
    private final String SERVICE_NAME_REGEX = "^[A-Z][a-z]*+(\\s[a-z]+)*$";
    private final String USABLE_AREA_REGEX = "^0*([1-9]\\d{2,}|[3-9]\\d|[1-9]\\d{2,}[.]\\d+|[3-9]\\d[.]\\d+)$";
    private final String POOL_AREA_REGEX = "^0*([1-9]\\d{2,}|[3-9]\\d|[1-9]\\d{2,}[.]\\d+|[3-9]\\d[.]\\d+)$";
    private final String RENTAL_COSTS_REGEX = "^0*\\d+.*\\d+$";
    private final String MAXIMUM_NUMBER_OF_PEOPLE = "^0*([1-9]|1[0-9])$";
    private final String FLOOR_NUMBER_REGEX = "^0*[1-9]\\d*$";
    private final String RENTAL_TYPE_REGEX = "^[A-Z][a-z]*+(\\s[a-z]+)*$";
    private final String ROOM_STANDARD_REGEX = "^[A-Z][a-z]*+(\\s[a-z]+)*$";

    public RegexCode() {
    }

    public String getROOM_CODE_REGEX() {
        return ROOM_CODE_REGEX;
    }

    public String getVILLA_CODE_REGEX() {
        return VILLA_CODE_REGEX;
    }

    public String getSERVICE_NAME_REGEX() {
        return SERVICE_NAME_REGEX;
    }

    public String getUSABLE_AREA_REGEX() {
        return USABLE_AREA_REGEX;
    }

    public String getPOOL_AREA_REGEX() {
        return POOL_AREA_REGEX;
    }

    public String getRENTAL_COSTS_REGEX() {
        return RENTAL_COSTS_REGEX;
    }

    public String getMAXIMUM_NUMBER_OF_PEOPLE() {
        return MAXIMUM_NUMBER_OF_PEOPLE;
    }

    public String getFLOOR_NUMBER_REGEX() {
        return FLOOR_NUMBER_REGEX;
    }

    public String getRENTAL_TYPE_REGEX() {
        return RENTAL_TYPE_REGEX;
    }

    public String getROOM_STANDARD_REGEX() {
        return ROOM_STANDARD_REGEX;
    }

    @Override
    public String toString() {
        return "Regex_Code{" +
                "ROOM_CODE_REGEX='" + ROOM_CODE_REGEX + '\'' +
                ", VILLA_CODE_REGEX='" + VILLA_CODE_REGEX + '\'' +
                ", SERVICE_NAME_REGEX='" + SERVICE_NAME_REGEX + '\'' +
                ", USABLE_AREA_REGEX='" + USABLE_AREA_REGEX + '\'' +
                ", POOL_AREA_REGEX='" + POOL_AREA_REGEX + '\'' +
                ", RENTAL_COSTS_REGEX='" + RENTAL_COSTS_REGEX + '\'' +
                ", MAXIMUM_NUMBER_OF_PEOPLE='" + MAXIMUM_NUMBER_OF_PEOPLE + '\'' +
                ", FLOOR_NUMBER_REGEX='" + FLOOR_NUMBER_REGEX + '\'' +
                ", RENTAL_TYPE_REGEX='" + RENTAL_TYPE_REGEX + '\'' +
                ", ROOM_STANDARD_REGEX='" + ROOM_STANDARD_REGEX + '\'' +
                '}';
    }
}
