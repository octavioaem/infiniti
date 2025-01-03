package com.adobe.aem.infiniti.core.models;

import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class HeaderModel {

    @ValueMapValue
    private String buttonLabel;

    @ValueMapValue
    private String buttonLink;

    public String getButtonLabel() {
        return buttonLabel;
    }

    public String getButtonLink() {
        return buttonLink;
    }
}