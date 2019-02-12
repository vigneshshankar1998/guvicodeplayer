 public static String stringReverser(String s) {
        if (s == null || s.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (s.length() < 2) {
            return s;
        }
        String[] stArr = s.split(" ");
        StringBuffer newHolder = new StringBuffer();
        for (int i = 0; i < stArr.length; i++) {
            int j = 0;
            int len = stArr[i].length();
            char[] newChrStr = stArr[i].toCharArray();
            while (j < len) {
                char temp = newChrStr[j];
                newChrStr[j] = newChrStr[len - 1];
                newChrStr[len - 1] = temp;
                len--;
                j++;
            }
            newHolder.append(String.valueOf(newCharStr));
            if(i != strArr.length-1){
                newHolder.append(" ");
            }
        }

        return newHolder.toString();
    }
