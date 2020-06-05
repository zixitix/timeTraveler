public class TimeTraveler {

    Paper paper = null;

    public Paper LeavePaper(){
        return paper;
    }

    public void computePaperAndStore(Paper paperA){

        if (paperA == null) {
            paperA = new Paper();
            paperA.firstNumber = null;
            paperA.secondNumber = null;
            paperA.result = 181429;
            this.paper = paperA;
            return;
        }

        Integer firstNumber = paperA.firstNumber;
        Integer secondNumber = paperA.secondNumber;
        Paper paperB = new Paper();


        if(firstNumber == null && secondNumber == null) {
            firstNumber = 101;
            secondNumber = 101;
        } else {
            Integer result = firstNumber * secondNumber;
            if(!result.equals(paperA.result)) {
                if (secondNumber + 2 <= 997) {
                    secondNumber = secondNumber + 2;
                } else if (firstNumber + 2 <= 997) {
                    firstNumber = firstNumber + 2;
                    secondNumber = 101;
                } else {
                    paperA.firstNumber = null;
                    paperA.secondNumber = null;
                }
            }
        }
        paperB.firstNumber = firstNumber;
        paperB.secondNumber = secondNumber;
        paperB.result = paperA.result;
        this.paper = paperB;
    }

    public void travelInTime(TimeTravelDevice timeTurner){
        timeTurner.preserveTimeTravelerForNextLoop(this);
    }

}
