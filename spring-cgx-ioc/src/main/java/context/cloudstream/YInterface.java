package context.cloudstream;

/**
 * @author guoxiong
 * 2020/2/5 下午10:13
 */
public interface YInterface {

    @Output("myOutputY")
    MessageChannel output();

}
