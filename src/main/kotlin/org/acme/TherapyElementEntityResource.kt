package org.acme

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource
import io.quarkus.rest.data.panache.ResourceProperties
import java.util.UUID
import javax.transaction.Transactional


@Transactional
@ResourceProperties(path = "therapy-element")
interface TherapyElementEntityResource : PanacheEntityResource<TherapyElement, UUID>