package com.company;

public class Board {

    public int Board[][];

    public void setBoard(int x, int y, int value)
    {
            this.Board[x][y]=value;
    }

    public void initializeBoard(int start, int end)
    {
        for (int i=start;i<end;i++)
        {
            for(int j=start;j<end;j++)
            {
                Board[i][j]=0;
            }
        }
    }

    public void writeBoard(int start, int end)
    {
        for (int i=start;i<end;i++)
        {

            for(int j=start;j<end;j++)
            {
                System.out.println(this.Board[i][j]);
            }
            System.out.println("");
        }
    }

}
