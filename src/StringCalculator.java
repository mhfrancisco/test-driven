public class StringCalculator {

    public static void main(String[] args) {
        StringCalculator sc = new StringCalculator();
        int sample = sc.add("2,5");
        System.out.println(sample);
    }

    public int add(String args) {
        int retVal = 0;
        if (!"".equals(args)) {
            for (String param:
                    getParamString(args).split(getDelimiter(args))) {
                retVal += Integer.parseInt(param);
            }
        }
        return retVal;
    }

    private String getDelimiter(String args) {
        String delimiter = ",|\n";
        if (args.startsWith("//")) {
            delimiter = args.substring(2, args.indexOf("\n"));
        }
        return delimiter;
    }

    private String getParamString(String args) {
        String paramStr = args;
        if (args.startsWith("//")) {
            paramStr = args.substring(args.indexOf("\n") + 1);
        }
        return paramStr;
    }
}
