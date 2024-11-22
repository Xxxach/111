public abstract class Main {public static void main(String[] args){
    Application Emulator = new Application("J2ME Loader", "1.8.2", "1920x1080");
    String nameApp = Emulator.getnameApp();
    String ApplicationVersion = Emulator.getVersion();
    String ApplicationResolution = Emulator.getResolution();

    Activity EmulatorActivity = new Activity(280, 520,"light_gray",80,"true");
    int ActivityWidth = EmulatorActivity.getActivityWidth();
    int ActivityHeight = EmulatorActivity.getActivityHeight();
    String Color = EmulatorActivity.getColor();
    int Transparency = EmulatorActivity.getTransparency();
    String Movable = EmulatorActivity.getMovable();

    Fragment EmulatorFragment = new Fragment(3,135,350,2,3,"black","orange");
    int LayoutType = EmulatorFragment.getLayoutType();
    int FragmentWidth = EmulatorFragment.getFragmentWidth();
    int FragmentHeight = EmulatorFragment.getFragmentHeight();
    int ColumnsCount = EmulatorFragment.getColumnsCount();
    int LinesCount = EmulatorFragment.getLinesCount();
    String TextColor = EmulatorFragment.getTextColor();
    String BackgroundColor = EmulatorFragment.getBackgroundColor();

    Application.onStart(nameApp);
    Activity.onStart();
    Activity.onPause();
    Activity.onStop();
    Activity.onResume();
    Activity.onCreate();
    Fragment.onStart();
    Fragment.onAttach();
    Fragment.onPause();
    Fragment.onResume();
    Fragment.onDetach();
    Fragment.onCreateView();
    Fragment.onDestroy();
    Activity.onDestroy();
    Application.onClose();
}}