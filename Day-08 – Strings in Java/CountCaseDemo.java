public class CountCaseDemo {
    public static void main(String[] args) {
        String name = "Adarsh";

        int UpperCasecount = 0;
        int LowerCasecount = 0;

        for(int i = 0; i < name.length(); i++)
        {
            char ch = name.charAt(i);
            {
                if(Character.isUpperCase(ch))
                {
                    UpperCasecount++;
                }
                if(Character.isLowerCase(ch))
                {
                    LowerCasecount++;
                }
            }
        }
        System.out.println("UpperCase: " + UpperCasecount);
        System.out.println("LowerCase: " + LowerCasecount);
    }
}