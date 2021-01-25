package game;

public class Player
{
    //declarations variables
    String _playerName;
    int _playerScores;
    int addPoints=5;

    //declarations methods

    String getName(){
        return _playerName;
    }

    int getScores(){
        return _playerScores;
    }

    @Override
    public String toString(){
    return "Player Name "+ _playerName + "Player Scores "+_playerScores;
    }
    
    public void addPoints(int addPoints){
        _playerScores=_playerScores+addPoints;
    }
}//end of class
