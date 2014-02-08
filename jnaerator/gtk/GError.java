package gtk;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/glib/gerror.h:43</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Gtk") 
public abstract class GError extends StructObject {
	static {
		BridJ.register();
	}
	/** C type : GQuark */
	@Field(0) 
	public int domain() {
		return this.io.getIntField(this, 0);
	}
	/** C type : GQuark */
	@Field(0) 
	public GError domain(int domain) {
		this.io.setIntField(this, 0, domain);
		return this;
	}
	/** Conversion Error : gint (Unsupported type) */
	/** C type : gchar* */
	@Field(2) 
	public Pointer<Byte > message() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : gchar* */
	@Field(2) 
	public GError message(Pointer<Byte > message) {
		this.io.setPointerField(this, 2, message);
		return this;
	}
}
