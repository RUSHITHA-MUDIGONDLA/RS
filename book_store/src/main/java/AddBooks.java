import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Getter
@Setter
@RequestMapping
public class AddBooks {

    @PostMapping
    static String name(String names)
    {
        return names;
    }

    public static void main(String[] args)
    {
        String names;
        names="rushi";
        System.out.println(AddBooks.name(names));
    }
}
