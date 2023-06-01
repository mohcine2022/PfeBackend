package com.mohcine.pfe.services.AppServiceImpl;

import com.mohcine.pfe.dao.RoleRepository;
import com.mohcine.pfe.model.Conge;
import com.mohcine.pfe.model.Role;
import com.mohcine.pfe.services.AppService.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }
    @Override
    public Role creerRole(Conge role) {
        return roleRepository.save(role);
    }
}
