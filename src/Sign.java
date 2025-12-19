public class Sign {
    private String text = "";
    private int width = 0;
    private int count = 1;
    public Sign(String text, int width) {
        this.text = text;
        this.width = width;
        if (text.length() % width > 0) count = text.length()/width + 1;
        else count = text.length()/width;
    }
    public String getLines(){
        String temp = "";
        if (text.isEmpty()) return null;
        for(int i = 0; i <= count; i+= width){
            if (i + width <= text.length()){
                temp = temp + text.substring(i,i + width) + ";";
            } else{
                temp = temp + text.substring(i) + ";";
            }
        }
        temp = temp.substring(0, temp.length() - 1);
        return temp;
    }
    public int numberOfLines(){
        if (!text.isEmpty()) return count;
        return 0;
    }
}

