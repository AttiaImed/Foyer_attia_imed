package tn.esprit.sprint.foyer_attia_imed.Services.Impl;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.cglib.core.Block;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import tn.esprit.sprint.foyer_attia_imed.Entites.Bloc;
import tn.esprit.sprint.foyer_attia_imed.Entites.Foyer;
import tn.esprit.sprint.foyer_attia_imed.Repositroy.BlockRepository;
import tn.esprit.sprint.foyer_attia_imed.Repositroy.FoyerRepository;
import tn.esprit.sprint.foyer_attia_imed.Services.FoyerService;
import tn.esprit.sprint.foyer_attia_imed.Services.IBlockService;

import java.util.List;

@Primary
@Service("BlockServiceImpl")
@AllArgsConstructor
public class BlockServiceImpl implements IBlockService {
    BlockRepository blockRepository;
    FoyerService foyerService;

    @Override
    public List<Bloc> getAllBlocks() {
        return blockRepository.findAll();
    }

    @Override
    public Bloc addBlock(Bloc block) {
       Foyer foyer =  foyerService.getFoyerById(block.getFoyer().getIdFoyer());
        if(foyer != null){
            return  blockRepository.save(block);

        }else if( foyer == null){
            throw new EntityNotFoundException("Foyer with ID " + block.getFoyer().getIdFoyer() + " not found");
        }
        return null;
    }

    @Override
    public void removeBlock(long id) {
        blockRepository.deleteById(id);
    }

    @Override
    public Bloc modifyBlock(Bloc e, long id) {
        Bloc blocToModify = blockRepository.findById(id).orElse(null);

        if (blocToModify != null) {
            blocToModify.setNom(e.getNom());
            blocToModify.setCapacite(e.getCapacite());

            return blockRepository.save(blocToModify);
        } else {
            throw new EntityNotFoundException("Bloc with ID " + id + " not found");
        }
    }
}
