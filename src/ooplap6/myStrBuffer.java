package ooplap6;

public class myStrBuffer {
    public static void main(String[] args) {
    //stringBuffer
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" ");
        buffer.append("to");
        buffer.append(" ");
        buffer.append("RMUTSV");
        buffer.append(" ");
        buffer.append("2017");
        System.out.println(buffer);
        buffer.replace(0,5 ,"University of"); //เปลี่ยนข้อความตำเเหน่งที่ 0,5 เพิ่มคำที่ต้องการลง
        System.out.println(buffer);
        System.out.println(buffer.reverse()); //คำจะสลับ
        buffer.setCharAt(0,'T'); //เปลี่ยนตัวอักษรเป็น T
        System.out.println(buffer);



    }//main
}//class
