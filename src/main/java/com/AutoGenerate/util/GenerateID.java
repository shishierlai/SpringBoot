package com.AutoGenerate.util;

import java.util.UUID;

public class GenerateID {
    private static GenerateID me = new GenerateID();

    public static GenerateID getInstance() {
        return me;
    }
    public String[] chars = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z" };
    public String generateShortUuid() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 0x3E]);
        }
        return shortBuffer.toString();
    }

    public String generateID(){
//		String id= UUID.randomUUID().toString();
//		String dateStr = idDateFmt.format(new Date());
//		//22位缩短UUID + 5位日期的16进制大写 + 1位16进制分片号 + 4位库号
//		return shorter(id) + Integer.toHexString(Integer.valueOf(dateStr)).toUpperCase() + "F" + "ODFF";
        return new GenerateIObjectID().toHexString();
    }

}
