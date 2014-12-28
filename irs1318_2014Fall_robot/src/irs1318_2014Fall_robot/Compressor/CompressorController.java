package irs1318_2014Fall_robot.Compressor;

import irs1318_2014Fall_robot.Common.IController;

public class CompressorController implements IController
{
    private boolean isStarted;
    private CompressorComponent component;

    public CompressorController(CompressorComponent component)
    {
        this.component = component;        
        this.isStarted = false;
    }

    public void run()
    {
        if (!this.isStarted)
        {
            this.component.start();
            this.isStarted = true;
        }
    }
}