package com.KissTech.crm.mapper;

import com.KissTech.crm.DTO.StaffManagementDTO;
import com.KissTech.crm.createDTO.CreateStaffManagementDTO;
import com.KissTech.crm.model.StaffManagement;
import com.KissTech.crm.updateDTO.UpdateStaffManagementDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class StaffManagementMapper {

    public StaffManagement dtoToModel(CreateStaffManagementDTO dto) {
        StaffManagement staff = new StaffManagement();

        staff.setName(dto.getName());
        staff.setRole(dto.getRole());
        staff.setEmail(dto.getEmail());
        staff.setPhoneNo(dto.getPhoneNo());
        staff.setDepartment(dto.getDepartment());
        staff.setJoiningDate(dto.getJoiningDate());
        staff.setCreatedAt(String.valueOf(LocalDateTime.now()));
        staff.setCreatedBy(dto.getUserId());
        staff.setIdProof(dto.getIdProof());
        staff.setProofNo(dto.getProofNo());

        return staff;
    }

    public StaffManagementDTO modelToDTO(StaffManagement staff) {
        StaffManagementDTO dto = new StaffManagementDTO();

        dto.setId(staff.getId());
        dto.setName(staff.getName());
        dto.setRole(staff.getRole());
        dto.setEmail(staff.getEmail());
        dto.setPhoneNo(staff.getPhoneNo());
        dto.setDepartment(staff.getDepartment());
        dto.setJoiningDate(staff.getJoiningDate());
        dto.setCreatedAt(staff.getCreatedAt());
        dto.setCreatedBy(staff.getCreatedBy());
        dto.setIdProof(staff.getIdProof());
        dto.setProofNo(staff.getProofNo());

        return dto;
    }

    public StaffManagement updateDtoToModel(UpdateStaffManagementDTO dto, StaffManagement existingStaff) {
        existingStaff.setName(dto.getName());
        existingStaff.setRole(dto.getRole());
        existingStaff.setEmail(dto.getEmail());
        existingStaff.setPhoneNo(dto.getPhoneNo());
        existingStaff.setDepartment(dto.getDepartment());
        existingStaff.setJoiningDate(dto.getJoiningDate());
        existingStaff.setCreatedAt(dto.getCreatedAt());
        existingStaff.setCreatedBy(dto.getCreatedBy());
        existingStaff.setIdProof(dto.getIdProof());
        existingStaff.setProofNo(dto.getProofNo());

        return existingStaff;
    }

}
