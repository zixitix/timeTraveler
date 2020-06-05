
public class Paper{
    Integer firstNumber;

    Integer secondNumber;

    Integer result;

    public Paper() {
    }

    public Paper(Paper paper) {
        this.firstNumber = paper.firstNumber;
        this.secondNumber = paper.secondNumber;
        this.result = paper.result;
    }

    public boolean equals (Paper paper){
        if(paper == null){
            return false;
        }

        return this.firstNumber.equals(paper.firstNumber) && this.secondNumber.equals(paper.secondNumber) && this.result.equals(paper.result);
    }
}