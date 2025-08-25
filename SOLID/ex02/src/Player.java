public class Player implements IPlayer
{
	private IFrame last;

	@Override
	public void play(byte[] fileBytes)
	{
		// decode
		last = decodeFrame(fileBytes);
		// draw UI
		drawUI(fileBytes);
		// cache
		cacheFrame();
	}

	private IFrame decodeFrame(byte[] fileBytes)
	{
		return new Frame(fileBytes); // pretend decoding
	}

	private void drawUI(byte[] fileBytes)
	{
		System.out.println("▶ Playing " + fileBytes.length + " bytes");
	}

	private void cacheFrame()
	{
		System.out.println("Cached last frame? " + (last != null));
	}
}