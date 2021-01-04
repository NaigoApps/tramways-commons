package it.tramways.core;

import java.util.UUID;

public abstract class DomainEntity implements Identifiable {

	private Long id;

	private String uuid;

	public DomainEntity() {
		uuid = UUID.randomUUID().toString();
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
