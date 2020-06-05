public class World {

    /**
     * Модель в котором вселенная сама по себе крутится в петле,
     * и путешественник во времени не возвращается в прошлое, а перемещается
     * в следующую петлю существования вселенной.
     * Мы действительно падаем в вечную петлю с правильный результатом, через какое-то время,
     * и остаемся в ней. Проблема с данной моделью в том, что она не порождает временных парадоксов,
     * гарри переместившийся из первой петли исчезает из этого мира, и появляется в следующем
     * и то, что их воспоминания отличаются не является проблемой потому что это разные Гарри,
     * и для этой модели нет никаких причин порождать бумажки с надписью "НЕ ШУТИ СО ВРЕМЕНЕМ"
     *
     * https://hpmor.ru/book/1/17/
    * */
    public static void main(String[] args) throws InterruptedException {

        TimeTravelDevice timeTurner = new TimeTravelDevice();

        while (true){
//          Большой взрыв, зарождение земли и тд
            TimeTraveler HarryFromThisTime = new TimeTraveler();
            TimeTraveler HarryFromDifferentTime = timeTurner.returnTimeTravelerToReality();
            Paper paperOnTheFloor;

            if(HarryFromDifferentTime == null){
                paperOnTheFloor = null;
            } else {
                paperOnTheFloor = HarryFromDifferentTime.LeavePaper();
            }

            HarryFromThisTime.computePaperAndStore(paperOnTheFloor);

            HarryFromThisTime.travelInTime(timeTurner);

            if(paperOnTheFloor != null){
                System.out.println(paperOnTheFloor.firstNumber + " * " + paperOnTheFloor.secondNumber + "  " + paperOnTheFloor.result );
            }

//            Контроль промежутка между выводом состояний в миллисекундах.
//            Для наиболее быстрого вывода уберите это строку
            Thread.sleep(10);

//          Гарри сражается с Квиррелом, Солнце превращается в Красного гиганта, и тд
        }
    }


}

