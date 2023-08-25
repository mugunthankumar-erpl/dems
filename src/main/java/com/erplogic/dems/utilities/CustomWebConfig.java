/**
 *
 */
package com.erplogic.dems.utilities;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.data.web.SortHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CustomWebConfig implements WebMvcConfigurer {

    @Override
    public void addArgumentResolvers(final List<HandlerMethodArgumentResolver> argumentResolvers) {

        // sort
        final SortHandlerMethodArgumentResolver sortResolver = new SortHandlerMethodArgumentResolver();
        sortResolver.setSortParameter("order-by");

        final PageableHandlerMethodArgumentResolver pageResolver = new PageableHandlerMethodArgumentResolver(
            sortResolver);

        pageResolver.setPageParameterName("page-number");
        pageResolver.setSizeParameterName("page-size");
        pageResolver.setOneIndexedParameters(true);

        final Pageable defaultPageable = PageRequest.of(0, 26);
        pageResolver.setFallbackPageable(defaultPageable);

        argumentResolvers.add(pageResolver);
    }

}
