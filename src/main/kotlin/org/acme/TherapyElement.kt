package org.acme

import io.quarkus.hibernate.orm.panache.kotlin.PanacheEntityBase
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Id


data class TherapyElement(
    @Id
    @Column(name = "id", unique = true, updatable = false, nullable = false)
    var id: UUID
) : PanacheEntityBase