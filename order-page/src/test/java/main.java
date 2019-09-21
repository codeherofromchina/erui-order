import org.apache.commons.lang3.StringUtils;

/**
 * @Auther 王晓丹
 * @Date 2019/9/18 上午9:51
 */
public class main {


    public static void main(String[] args) {

        String abc = "000034";

        boolean numeric = StringUtils.isNumeric(abc);
        if (numeric) {
            System.out.println(Integer.parseInt(abc));
        }



    }
}
