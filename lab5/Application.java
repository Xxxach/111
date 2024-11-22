public class Application {
    private String nameApp;
    private String Version;
    private String Resolution;

    public Application(String nameApp, String Version, String Resolution) {
        this.nameApp = nameApp;
        this.Version = Version;
        this.Resolution = Resolution;
    }

    public String getnameApp(){
        return nameApp;
    }
    public void setnameApp(String nameApp){
        this.nameApp = this.nameApp;
    }
    public String getVersion(){
        return Version;
    }
    public void setVersion(String Version){
        this.Version = Version;
    }
    public String getResolution(){
        return Resolution;
    }
    public void setResolution(String Resolution){
        this.Resolution = Resolution;
    }

    static void onStart(String nameApp) {
        System.out.println("Стартовая точка программы " + nameApp);
    }
    static void onClose() {
        System.out.println("Закрытие программы");
    }
}