package games;

public enum PathEnum {
    GAMES("C:/Users/User/Desktop/Games", true),
    SRC(GAMES.getPath() + "/src", true),
    RES(GAMES.getPath() + "/res", true),
    SAVEGAMES(GAMES.getPath() + "/savegames", true),
    TEMP(GAMES.getPath() + "/temp", true),
    MAIN(SRC.getPath() + "/main", true),
    TEST(SRC.getPath() + "/test", true),
    DRAWABLES(RES.getPath() + "/drawables", true),
    VECTORS(RES.getPath() + "/vectors", true),
    ICONS(RES.getPath() + "/icons", true),

    TEMP_TXT(TEMP.getPath() + "/temp.txt", false),
    MAIN_JAVA(MAIN.getPath() + "/Main.java", false),
    UTILS_JAVA(MAIN.getPath() + "/Utils.java", false);


    public String getPath() {
        return path;
    }

    public boolean isDir() {
        return dir;
    }

    private final String path;
    private final boolean dir;

    PathEnum(String path, boolean dir) {
        this.path = path;
        this.dir = dir;
    }
}
