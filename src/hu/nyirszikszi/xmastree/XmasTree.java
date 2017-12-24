package hu.nyirszikszi.xmastree;

public class XmasTree {
    private int l;

    public XmasTree(int l) {
        this.l = l;
    }

    public String drawing() {
        String tree = "";

        for(int i=0; i<this.l; i++) {
            for(int j=0; j<this.l-i; j++) {
                tree += " ";
            }
            for(int k=0; k<(2*i+1); k++) {
                tree += "*";
            }
            tree += "\n";
        }

        return tree;
    }
}