<p align="center">
  <img src="https://github.com/psambit9791/jDSP/blob/master/res/img/jDSP-Logo.png" alt="jDSP Logo"/>
</p>

[![Build Status](https://travis-ci.com/psambit9791/jDSP.svg?branch=master)](https://travis-ci.com/psambit9791/jDSP)
[![codecov](https://codecov.io/gh/psambit9791/jDSP/branch/master/graph/badge.svg)](https://codecov.io/gh/psambit9791/jDSP)
[![Maven Central](https://img.shields.io/maven-central/v/com.github.psambit9791/jdsp.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.github.psambit9791%22%20AND%20a:%22jdsp%22)
[![javadoc](https://javadoc.io/badge2/com.github.psambit9791/jdsp/javadoc.svg)](https://javadoc.io/doc/com.github.psambit9791/jdsp)
[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg?)](https://github.com/psambit9791/jDSP/blob/master/LICENSE)
[![DOI](https://zenodo.org/badge/DOI/10.5281/zenodo.3903921.svg)](https://doi.org/10.5281/zenodo.3903921)

jDSP is a library of signal processing tools aimed at providing functionalities as available in scipy-signal package for 
Python. The goal is to provide easy-to-use APIs for performing complex operation on signals eliminating the necessity 
of understanding the low-level complexities in the processing pipeline.  

## Quick Start

<br/>

To get the latest stable release of jDSP:

### Gradle
```
implementation 'com.github.psambit9791:jdsp:0.4.0'
```

### Maven
```
<dependency>
  <groupId>com.github.psambit9791</groupId>
  <artifactId>jdsp</artifactId>
  <version>0.4.0</version>
</dependency>
```

<br/>

For the latest development version of jDSP (unreleased):

### Github
```  
git clone --single-branch --branch master https://github.com/psambit9791/jDSP.git
``` 

<br/>

## Documentation

See the [**Wiki**](https://github.com/psambit9791/jDSP/wiki) for an introduction to the general use of jDSP.

See the [**javadocs**](https://javadoc.io/doc/com.github.psambit9791/jdsp) for more advanced documentation.

<br/>

## Usage

| **Class** 		| **Type**		    | **Description**	|
| ------------- | ------------- | ------------- |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/filter/Butterworth.html">com.github.psambit9791.jdsp.filter.Butterworth</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Frequency-Based-Filter">Frequency-based <strong>Filter</strong></a> | Implements Butterworth Filter for low-pass, high-pass, band-pass and band-stop operation |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/filter/Chebyshev.html">com.github.psambit9791.jdsp.filter.Chebyshev</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Frequency-Based-Filter">Frequency-based <strong>Filter</strong></a> | Implements Chebyshev Filter (Type 1 and Type 2) for low-pass, high-pass, band-pass and band-stop operation |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/filter/Bessel.html">com.github.psambit9791.jdsp.filter.Bessel</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Frequency-Based-Filter">Frequency-based <strong>Filter</strong></a> | Implements Bessel Filter for low-pass, high-pass, band-pass and band-stop operation |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/filter/Median.html">com.github.psambit9791.jdsp.filter.Median</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Kernel-Based-Filter">Kernel-based <strong>Filter</strong></a> | Implements Median Filter for smoothing while maintaining the sharp edges |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/filter/Savgol.html">com.github.psambit9791.jdsp.filter.Savgol</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Kernel-Based-Filter">Kernel-based <strong>Filter</strong></a> | Implements Savitzky–Golay Filter for smoothing using Savitzky–Golay coefficients |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/filter/Wiener.html">com.github.psambit9791.jdsp.filter.Wiener</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Kernel-Based-Filter">Kernel-based <strong>Filter</strong></a> | Implements Wiener Filter for the sharpening operation |
||||
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/signal/Convolution.html">com.github.psambit9791.jdsp.signal.Convolution </a> | <a href="https://github.com/psambit9791/jDSP/wiki/Convolution-&-Cross-Correlation"><strong>Signal</strong> Operation</a> | Implements the convolve() and convolve1d() operation |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/signal/CrossCorrelation.html">com.github.psambit9791.jdsp.signal.CrossCorrelation</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Convolution-&-Cross-Correlation"><strong>Signal</strong> Operation</a> | Implements the cross-correlation operation |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/signal/Detrend.html">com.github.psambit9791.jdsp.signal.Detrend</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Detrend"><strong>Signal</strong> Operation</a> | Implements the detrend operaton to remove trends from a signal |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/signal/Smooth.html">com.github.psambit9791.jdsp.signal.Smooth</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Smooth"><strong>Signal</strong> Operation</a> | Implements convolutional smoothing with rectangular and triangular window |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/signal/Decimate.html">com.github.psambit9791.jdsp.signal.Decimate</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Decimate"><strong>Signal</strong> Operation</a> | Implements the decimation operation to downsample a signal after applying an anti-aliasing filter |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/signal/Generate.html">com.github.psambit9791.jdsp.signal.Generate</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Generate"><strong>Signal</strong> Operation</a> | Helps to generate sin, cosine and square waves |
||||
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/signal/peaks/FindPeak.html">com.github.psambit9791.jdsp.signal.peaks.FindPeak</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Peak-&-Trough-Detection-and-Filtering"><strong>Peak</strong> Detection</a> | Identifies peaks in the signal |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/signal/peaks/Peak.html">com.github.psambit9791.jdsp.signal.peaks.Peak</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Peak-&-Trough-Detection-and-Filtering"><strong>Peak</strong> Detection</a> | Calculates peak properties and allows filtering with them |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/signal/peaks/Spike.html">com.github.psambit9791.jdsp.signal.peaks.Spike</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Spike-Detection-and-Filtering"><strong>Peak</strong> Detection</a> | Calculates spike properties and allows filtering with them |
||||
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/transform/DiscreteFourier.html">com.github.psambit9791.jdsp.transform.DiscreteFourier</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Fourier-Transforms"><strong>Transformation</strong></a> | Applies the Discrete Fourier Transform on a signal |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/transform/InverseDiscreteFourier.html">com.github.psambit9791.jdsp.transform.InverseDiscreteFourier</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Fourier-Transforms"><strong>Transformation</strong></a> | Applies the Inverse Discrete Fourier Transform on a sequence and returns the original signal |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/transform/Hilbert.html">com.github.psambit9791.jdsp.transform.Hilbert</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Hilbert-Transform"><strong>Transformation</strong></a> | Applies the Hilbert Transform on a signal and provides functions to return amplitude, phase and frequency information |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/transform/PCA.html">com.github.psambit9791.jdsp.transform.PCA</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Principal-Component-Analysis"><strong>Transformation</strong></a> | Applies Principal Component Analysis on the multi-channel signal and returns a low-dimensional signal |
||||
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/misc/UtilMethods.html">com.github.psambit9791.jdsp.misc.UtilMethods</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Utilities"><strong>Miscellaneous</strong></a> | Provides Numpy style utility functions, details in Wiki |
| <a href="https://javadoc.io/doc/com.github.psambit9791/jdsp/latest/com/github/psambit9791/jdsp/misc/Plotting.html">com.github.psambit9791.jdsp.misc.Plotting</a> | <a href="https://github.com/psambit9791/jDSP/wiki/Plotting"><strong>Miscellaneous</strong></a> | Enables plotting of different signals and points using line and scatter plots |
<br/>

## Citation

If you are using this software in your research, please use the following citation:

```
@software{sambit_paul_2020_4009048,
  author       = {Sambit Paul},
  title        = {psambit9791/jDSP: v0.4.0 (August 31, 2020)},
  month        = aug,
  year         = 2020,
  publisher    = {Zenodo},
  version      = {v0.4.0},
  doi          = {10.5281/zenodo.4009048},
  url          = {https://doi.org/10.5281/zenodo.4009048}
}
```
## Supporting jDSP 

jDSP is an open source project. <br/> You can help by becoming a sponsor on <a href="https://patreon.com/sambitpaul">Patreon</a> or doing a one time donation on <a href="https://paypal.me/psambit9791">PayPal</a> <br />

<a href="https://patreon.com/sambitpaul" target="_blank"><img src="https://github.com/psambit9791/jDSP/blob/master/res/button/patron-button.png" alt="Become a Patron" /> </a>
&emsp;
<a href="https://paypal.me/psambit9791" target="_blank"><img src="https://github.com/psambit9791/jDSP/blob/master/res/button/paypal-button.png" alt="Become a Patron" /> </a>

<br/>

## License  
  
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details. <br/> 
You are free to use, modify and distribute this software, as long as the copyright header is left intact.