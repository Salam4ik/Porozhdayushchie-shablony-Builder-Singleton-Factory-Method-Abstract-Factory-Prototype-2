import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int threshold;

    public Filter(int threshold) {
        this.threshold = threshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (Integer i : source) {
            if (i >= threshold) {
                result.add(i);
                logger.log("Элемент \"" + i + "\" проходит" );
            }
            else logger.log("Элемент \"" + i + "\" не проходит" );
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);
        return result;
    }
}