package com.mycoachfit.api.infrastructure.adapter;

import com.mycoachfit.api.domain.model.Office;
import com.mycoachfit.api.domain.port.OfficePersistencePort;
import com.mycoachfit.api.infrastructure.adapter.entity.OfficeEntity;
import com.mycoachfit.api.infrastructure.adapter.mapper.OfficeDboMapper;
import com.mycoachfit.api.infrastructure.adapter.repository.OfficeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class OfficeAdapter implements OfficePersistencePort {

    private final OfficeRepository officeRepository;
    private final OfficeDboMapper officeDboMapper;

    public OfficeAdapter(OfficeRepository officeRepository, OfficeDboMapper officeDboMapper) {
        this.officeRepository = officeRepository;
        this.officeDboMapper = officeDboMapper;
    }

    @Override
    public Office create(Office office) {
        OfficeEntity officeEntitySaved = officeRepository.save(officeDboMapper.toDbo(office));
        return officeDboMapper.toDomain(officeEntitySaved);
    }

    @Override
    public Office update(Office office) {
        OfficeEntity officeEntitySaved = officeRepository.save(officeDboMapper.toDbo(office));
        return officeDboMapper.toDomain(officeEntitySaved);
    }

    @Override
    public List<Office> getAll() {
        return officeRepository.findAll()
                .stream()
                .map(officeDboMapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Office> findById(Long id) {
        return officeRepository.findById(id).map(officeDboMapper::toDomain);
    }
}
