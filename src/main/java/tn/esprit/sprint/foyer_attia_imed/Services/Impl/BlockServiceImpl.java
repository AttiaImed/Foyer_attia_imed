package tn.esprit.sprint.foyer_attia_imed.Services.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.sprint.foyer_attia_imed.Repositroy.BlockRepository;
import tn.esprit.sprint.foyer_attia_imed.Services.IBlockService;

@Service
@AllArgsConstructor
public class BlockServiceImpl implements IBlockService {
    BlockRepository blockRepository;
}
