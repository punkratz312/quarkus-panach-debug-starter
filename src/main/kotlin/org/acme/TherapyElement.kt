package org.acme

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntityBase
import org.eclipse.microprofile.openapi.annotations.media.Schema
import org.hibernate.FetchMode.EAGER
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.OffsetDateTime
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Id
import javax.persistence.Lob
import javax.persistence.OneToMany


data class TherapyElement(
    @Id
    @Column(name = "id", unique = true, updatable = false, nullable = false)
    var id: UUID
) : PanacheEntityBase()