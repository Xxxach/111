public class Fragment{
    private int LayoutType;
    private int FragmentWidth;
    private int FragmentHeight;
    private int ColumnsCount;
    private int LinesCount;
    private String TextColor;
    private String BackgroundColor;

    public Fragment(int LayoutType, int FragmentWidth, int FragmentHeigth, int ColumnsCount, int LinesCount, String TextColor, String BackgroundColor) {
        this.LayoutType = LayoutType;
        this.FragmentWidth = FragmentWidth;
        this.FragmentHeight = FragmentHeigth;
        this.ColumnsCount = ColumnsCount;
        this.LinesCount = LinesCount;
        this.TextColor = TextColor;
        this.BackgroundColor = BackgroundColor;
    }

    public int getLayoutType(){
        return LayoutType;
    }
    public void setLayoutType(int LayoutType){
        this.LayoutType = LayoutType;
    }
    public int getFragmentWidth(){
        return FragmentWidth;
    }
    public void setFragmentWidth(int FragmentWidth){
        this.FragmentWidth = FragmentWidth;
    }
    public int getFragmentHeight(){
        return FragmentHeight;
    }
    public void setFragmentHeight(int FragmentHeight){
        this.FragmentHeight = FragmentHeight;
    }
    public int getColumnsCount(){
        return ColumnsCount;
    }
    public void setColumnsCount(int ColumnsCount){
        this.ColumnsCount = ColumnsCount;
    }
    public int getLinesCount(){
        return LinesCount;
    }
    public void setLinesCount(int LinesCount){
        this.LinesCount = LinesCount;
    }
    public String getTextColor(){
        return TextColor;
    }
    public void setTextColor(String TextColor){
        this.TextColor = TextColor;
    }
    public String getBackgroundColor(){
        return BackgroundColor;
    }
    public void setBackgroundColor(String BackgroundColor){
        this.BackgroundColor = BackgroundColor;
    }

    static void onAttach() {
        System.out.println("Приклепление к активити");
    }
    static void onStart() {
        System.out.println("Запуск экрана");
    }
    static void onCreateView() {
        System.out.println("Инициализация представления");
    }
    static void onViewCreated() {
        System.out.println("Вью было создано");
    }
    static void onDestroyView() {
        System.out.println("Уничтожение вью");
    }
    static void onPause() {
        System.out.println("Экран не виден пользователю");
    }
    static void onResume() {
        System.out.println("Экран снова виден пользователю");
    }
    static void onDetach() {
        System.out.println("Откреклепление от активити");
    }
    static void onDestroy() {
        System.out.println("Закрытие экрана");
    }
}