package com.crudmongo.mongodbcrud.models;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResonseData {

	@Id
	private String id;
	private long buildNumber;
	private double version;
	private String buildType;
	private String updatedBy;
	private String branchName;
	private String repositoryUrl;
	private String revisionNumber;
	private LocalDateTime deploymentDate;
	
	

}
