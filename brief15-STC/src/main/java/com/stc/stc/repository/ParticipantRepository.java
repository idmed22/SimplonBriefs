package com.stc.stc.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.stc.stc.entity.Participant;




public interface ParticipantRepository extends JpaRepository<Participant, Long> {
	
}
