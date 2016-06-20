package com.example.audit;

import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@RevisionEntity
@Table(name = "audit_revisions")
public class Revision extends DefaultRevisionEntity {

}
