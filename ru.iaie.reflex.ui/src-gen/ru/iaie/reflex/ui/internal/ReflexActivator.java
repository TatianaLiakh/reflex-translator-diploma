/*
 * generated by Xtext 2.19.0
 */
package ru.iaie.reflex.ui.internal;

import com.google.common.collect.Maps;
import com.google.inject.Guice;
import com.google.inject.Injector;
import java.util.Collections;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;
import ru.iaie.reflex.ReflexRuntimeModule;
import ru.iaie.reflex.ui.ReflexUiModule;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ReflexActivator extends AbstractUIPlugin {

	public static final String PLUGIN_ID = "ru.iaie.reflex.ui";
	public static final String RU_IAIE_REFLEX_REFLEX = "ru.iaie.reflex.Reflex";
	
	private static final Logger logger = Logger.getLogger(ReflexActivator.class);
	
	private static ReflexActivator INSTANCE;
	
	private Map<String, Injector> injectors = Collections.synchronizedMap(Maps.<String, Injector> newHashMapWithExpectedSize(1));
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		injectors.clear();
		INSTANCE = null;
		super.stop(context);
	}
	
	public static ReflexActivator getInstance() {
		return INSTANCE;
	}
	
	public Injector getInjector(String language) {
		synchronized (injectors) {
			Injector injector = injectors.get(language);
			if (injector == null) {
				injectors.put(language, injector = createInjector(language));
			}
			return injector;
		}
	}
	
	protected Injector createInjector(String language) {
		try {
			com.google.inject.Module runtimeModule = getRuntimeModule(language);
			com.google.inject.Module sharedStateModule = getSharedStateModule();
			com.google.inject.Module uiModule = getUiModule(language);
			com.google.inject.Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
			return Guice.createInjector(mergedModule);
		} catch (Exception e) {
			logger.error("Failed to create injector for " + language);
			logger.error(e.getMessage(), e);
			throw new RuntimeException("Failed to create injector for " + language, e);
		}
	}
	
	protected com.google.inject.Module getRuntimeModule(String grammar) {
		if (RU_IAIE_REFLEX_REFLEX.equals(grammar)) {
			return new ReflexRuntimeModule();
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected com.google.inject.Module getUiModule(String grammar) {
		if (RU_IAIE_REFLEX_REFLEX.equals(grammar)) {
			return new ReflexUiModule(this);
		}
		throw new IllegalArgumentException(grammar);
	}
	
	protected com.google.inject.Module getSharedStateModule() {
		return new SharedStateModule();
	}
	
	
}
