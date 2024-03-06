public class MyTable {
    private Entry[] entries;

    MyTable(){
        entries = new Entry[26];
    }

    public String get(char c){
        int cIndex =(int)c-97;
        return entries[cIndex].getStr();
    }

    public void add(char c,String s){
        int cIndex = (int)c - 97; //a
        Entry entry = new Entry(c,s);
        entries[cIndex] = entry;
    }

    public String toString(){
        String result = "";
        for(Entry entry:entries){
            if(entry != null){
                result = result + entry.toString()+"\n";
            }

        }
        return result;
    }

    private class Entry{
        char ch;
        String str;
        Entry(char ch,String str){
            this.ch = ch;
            this.str = str;

        }

        public char getCh() {
            return ch;
        }

        public String getStr() {
            return str;
        }

        public String toString(){
            return ch + "->" + str;
        }
    }

    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a',"Andrew");
        t.add('b',"Billy");
        t.add('w',"Willie");
        System.out.println(t);

    }

}
