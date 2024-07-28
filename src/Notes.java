import java.text.NumberFormat;

public class Notes {
    public static void notes() {
        System.out.println("Hello and welcome!");
        int result = Math.round(1.1F);
        System.out.println(result);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String ccy_format = currency.format(12345.678);
        String ccy_format2 = ccy_format + "10";

        System.out.println(ccy_format);
        System.out.println(ccy_format2);


        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}
