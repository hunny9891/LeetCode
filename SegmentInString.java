package strings;

public class SegmentInString {
    
    public int countSegments(String s) {
        int segmentCount = 0;
        int pointer = 0;
        String segment = "";
        for(int i=0;i<s.length() - 1;i++) {
            if(s.charAt(i) == ' ') {
                segment = s.substring(pointer, i);
                pointer = i+1;
                segmentCount++;
            }
        }
        return segmentCount;
    }
    
    public static void main(String[] args) {
        SegmentInString sis = new SegmentInString();
        String s = ", , , ,        a, eaefa";
        System.out.println(sis.countSegments(s));
    }
}
