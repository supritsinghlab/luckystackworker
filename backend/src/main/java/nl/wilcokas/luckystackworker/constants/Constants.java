package nl.wilcokas.luckystackworker.constants;

import java.math.BigDecimal;

public class Constants {

    private Constants() {
    }

    public static final String OUTPUT_POSTFIX = "_LSW";
    public static final String OUTPUT_POSTFIX_SAVE = "_REF";
    public static final String WORKER_FOLDER_POSTFIX = "_lsw";
    public static final String STATUS_IDLE = "Idle";
    public static final String STATUS_WORKING = "Working";
    public static final String DEFAULT_OUTPUT_FORMAT = "tif";
    public static final int MAX_ROI_X = 1024;
    public static final int MAX_ROI_Y = 768;
    public static final int MAX_WINDOW_SIZE = 1024;
    public static final BigDecimal DEFAULT_DENOISE_RADIUS = BigDecimal.valueOf(1);
    public static final BigDecimal DEFAULT_DENOISE_SIGMA = BigDecimal.valueOf(2);
    public static final int DEFAULT_DENOISE_ITERATIONS = 1;
    public static final String VERSION_URL = "https://www.wilcokas.com/luckystackworker/version";
    public static final String VERSION_URL_MARKER = "{lswVersion:";
    public static final String VERSION_URL_ENDMARKER = "}";
    public static final int VERSION_REQUEST_TIMEOUT = 5; // seconds
    public static final int VERSION_REQUEST_FREQUENCY = 14; // days
    public static final int DEFAULT_WINDOWS_POSITION_X = 754;
    public static final int DEFAULT_WINDOWS_POSITION_Y = 64;
    public static final int SHORT_HALF_SIZE = 32768;
    public static final int UNSIGNED_INT_SIZE = 65536;
    public static final int MAX_INT_VALUE = 65535;
    public static final int MAX_OPERATION_TIME_BEFORE_RESUMING = 5; // seconds
    public static final String SYSTEM_PROFILE_WINDOWS = "win";
    public static final String SYSTEM_PROFILE_MAC = "mac";
    public static final String SYSTEM_PROFILE_LINUX = "linux";
    public static final BigDecimal LOCAL_CONTRAST_FINE_RADIUS = BigDecimal.valueOf(4);
    public static final BigDecimal LOCAL_CONTRAST_MEDIUM_RADIUS = BigDecimal.valueOf(16);
    public static final BigDecimal LOCAL_CONTRAST_LARGE_RADIUS = BigDecimal.valueOf(64);
    public static final int DEFAULT_THRESHOLD = 4;
    public static final int RED_LAYER_INDEX = 1;
    public static final int GREEN_LAYER_INDEX = 2;
    public static final int BLUE_LAYER_INDEX = 3;
    public static final String DEFAULT_DENOISEALGORITHM = "OFF";
    public static final String DENOISE_ALGORITHM_SIGMA1 = "SIGMA1";
    public static final String DENOISE_ALGORITHM_SIGMA2 = "SIGMA2";
    public static final String DENOISE_ALGORITHM_SAVGOLAY = "SAVGOLAY";
    public static final String DENOISE_ALGORITHM_IANS = "IAN";
    public static final int SECONDS_AFTER_NEXT_EXECUTION = 3;
    public static final int MINIMUM_WINDOW_WIDTH = 528;
    public static final int ARTIFICIAL_PROGRESS_DELAY = 500;
    public static final int CONTROL_PANEL_WIDTH = 568;
}
