
import java.util.Random;                                                                              
import java.util.Scanner;                                                                    
                                                                        
                                                                                                      
public class MoraGame {


    public static void main(String[] args) {
        //

        Tom tom = new Tom();

        Scanner scanner = new Scanner(System.in);

        boolean gameSetFlag = false;

        while (true) {
            
            System.out.println("按任意键玩猜拳游戏，输入 q 退出");
            if (scanner.next().charAt(0) == 'q') {

                if (gameSetFlag) {
                    System.out.println("游戏结果: ");
                    System.out.println("游戏轮数 = " + tom.getGameCount());
                    System.out.println("玩家获胜次数 = " + tom.getWinCount());
                    System.out.println("玩家失败次数 = " + tom.getLoseCount());
                    System.out.println("平局次数 = " + tom.getDrawCount());
                }

                System.out.println("Bye~");
                return;
            }

            System.out.println("请输入你要出的拳（0-拳头，1-剪刀，2-布）");
            try {
                    tom.setPlayerChoice(scanner.nextInt());
                    System.out.println(tom.play());
                    gameSetFlag = true;

            } catch (IllegalArgumentException e) {
                System.out.println("数字输入错误，请检查您的输入!");
            }

        }
    }


}


class Tom {
    
    // 0 rock 1 scissor 2 paper
    private int computerChoice;
    private int playerChoice;
    private int gameCount;
    private int winCount;
    private int drawCount;
    private int loseCount;


    public void Tom() {
        gameCount = 0;
        winCount = 0;
        drawCount = 0;
        loseCount = 0;
    }


    public void setPlayerChoice(int playerChoice) {
        // 判断输入的数字是否合理
        if (playerChoice > 2 || playerChoice < 0) {
            // 抛出一个异常
            throw new IllegalArgumentException("数字输入错误");
        }

        this.playerChoice = playerChoice;
    }


    public int getPlayerChoice() {
        return playerChoice;
    }


    public int getGameCount() {
        return gameCount;
    }


    public int getWinCount() {
        return winCount;
    }


    public int getLoseCount() {
        return loseCount;
    }


    public int getDrawCount() {
        return drawCount;
    }


    public void setComputerChoice() {
        Random rand = new Random();
        computerChoice = rand.nextInt(3);
    }


    public int getComputerChoice() {
        return computerChoice;
    }


    public String play() {

        // 玩家一共 3 种获胜情况
        //  0. rock beats scissor
        //  1. scissor cuts paper
        //  2. paper covers rock

        ++gameCount;

        setComputerChoice();

        if (playerChoice == 0 && computerChoice == 2) {
            ++winCount;
            return "玩家获胜";
        } else if (playerChoice == 1 && computerChoice == 2) {
            ++winCount;
            return "玩家获胜";
        } else if (playerChoice == 2 && computerChoice == 0) {
            ++winCount;
            return "玩家获胜";
        } else if (playerChoice == computerChoice) {
            ++drawCount;
            return "平局";
        } else {
            ++loseCount;
            return "玩家输了";
        }

    }

}                                                                                                    
                                                                                                      