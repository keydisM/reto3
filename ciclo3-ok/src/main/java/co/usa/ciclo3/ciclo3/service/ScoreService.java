package co.usa.ciclo3.ciclo3.service;

import co.usa.ciclo3.ciclo3.model.Score;
import co.usa.ciclo3.ciclo3.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository scoreRepository;

    public List<Score> getAll(){
        return (List<Score>) scoreRepository.getAll();
    }

    public Optional<Score> getScore(int id){
        return scoreRepository.getScore(id);
    }

    public Score save(Score message){
        if(message.getIdScore()== null){
            return scoreRepository.save(message);
        }
        else{
            Optional<Score> e = scoreRepository.getScore(message.getIdScore());
            if(e.isEmpty()){
                return scoreRepository.save(message);
            }
            else{
                return message;
            }
        }
    }
}
