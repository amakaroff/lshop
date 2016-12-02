package com.makarov.lshop.base.dao.api.repository;

import com.makarov.lshop.base.model.ProfileEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

public interface ProfileRepository extends CrudRepository<ProfileEntity, BigInteger> {
}
