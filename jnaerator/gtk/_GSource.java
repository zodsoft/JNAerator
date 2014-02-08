package gtk;
import org.bridj.BridJ;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : glib-2.0/glib/gmain.h:142</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("Gtk") 
public abstract class _GSource extends StructObject {
	static {
		BridJ.register();
	}
	/** Conversion Error : gpointer (failed to convert type to Java (undefined type)) */
	/** Conversion Error : GSourceCallbackFuncs* (failed to convert type to Java (undefined type)) */
	/** Conversion Error : const GSourceFuncs* (failed to convert type to Java (undefined type)) */
	/** Conversion Error : guint (failed to convert type to Java (undefined type)) */
	/** Conversion Error : GMainContext* (failed to convert type to Java (undefined type)) */
	/** Conversion Error : gint (failed to convert type to Java (undefined type)) */
	/** Conversion Error : guint (failed to convert type to Java (undefined type)) */
	/** Conversion Error : guint (failed to convert type to Java (undefined type)) */
	/** Conversion Error : GSList* (failed to convert type to Java (undefined type)) */
	/** Conversion Error : GSource* (failed to convert type to Java (undefined type)) */
	/** Conversion Error : GSource* (failed to convert type to Java (undefined type)) */
	/** C type : char* */
	@Field(11) 
	public Pointer<Byte > name() {
		return this.io.getPointerField(this, 11);
	}
	/** C type : char* */
	@Field(11) 
	public _GSource name(Pointer<Byte > name) {
		this.io.setPointerField(this, 11, name);
		return this;
	}
	/** Conversion Error : GSourcePrivate* (failed to convert type to Java (undefined type)) */
}
