package aQute.implementation_selection.console.provider;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import aQute.implementation_selection.api.UserInterface;

@Component
public class ConsoleUserInterface implements UserInterface {

	Object launcher;

	@Activate
	void activate() {
		System.out.println("Selected console");
	}

	@Override
	public void print(String s) {
		System.out.println(s);
	}

	@Reference(target = "(launcher.arguments=-mode:console)")
	void bindLauncher(Object launcher) {
		System.out.println("binding launcher...");
		this.launcher = launcher;
	}
}
