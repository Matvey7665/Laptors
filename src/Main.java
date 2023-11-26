import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Asus",8,512,"Windows","Черный"));
        laptops.add(new Laptop("HP",16,256,"Windows","Серый"));
        laptops.add(new Laptop("Apple",16,1000,"macOS","Белый"));
        laptops.add(new Laptop("Asus",16,1000,"Windows","Черный"));
        laptops.add(new Laptop("Lenovo",8,256,"Windows","Серый"));
        sortLaptops(laptops);

    }
    public static void sortLaptops(Set<Laptop> laptops){
        Map<String,String> criterii = new HashMap<>();
        criterii.put("1","ОЗУ");
        criterii.put("2","Объем жд");
        criterii.put("3","Операционная система");
        criterii.put("4","Цвет");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру критерия: ");
        System.out.println("1-ОЗУ");
        System.out.println("2-объем жд");
        System.out.println("3-Операционная система");
        System.out.println("4-Цвет");
        String usesInput = scanner.nextLine();
        //Если критерий существует
        if (criterii.containsKey(usesInput)){
            String selectedCriterii = criterii.get(usesInput);
            System.out.println("Введите минимальное значение для вашего критерия: ");
            String minValue = scanner.nextLine();
            //Фильтрация
            Set<Laptop> filteredLaptops = new HashSet<>();
            switch (selectedCriterii){
                case "ОЗУ":
                    int minRam = Integer.parseInt(minValue);
                    for (Laptop laptop:laptops){
                        if (laptop.getRam()>=minRam){
                            filteredLaptops.add(laptop);
                        }
                    }
                    break;
                case "объем жд":
                    int minhddSize = Integer.parseInt(minValue);
                    for (Laptop laptop:laptops){
                        if (laptop.getHddSize()>=minhddSize){
                            filteredLaptops.add(laptop);
                        }
                    }
                    break;
                case "Операционная система":
                    for (Laptop laptop:laptops){
                        if (laptop.getOs().equalsIgnoreCase(minValue)){
                            filteredLaptops.add(laptop);
                        }
                    }
                    break;
                case "Цвет":
                    for (Laptop laptop:laptops){
                        if (laptop.getColor().equalsIgnoreCase(minValue)){
                            filteredLaptops.add(laptop);
                        }
                    }
                    break;
                default:
                    System.out.println("Некорректный выбор");
                    return;
            }
            if (filteredLaptops.isEmpty()){
                System.out.println("Результат:не найдено.");
            }
            else {
                for (Laptop laptop:filteredLaptops){
                    System.out.println(laptop);
                }
            }

        }
        else {
            System.out.println("Некорректный запрос");
        }
    }

}
